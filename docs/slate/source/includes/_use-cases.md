# Use Cases

We demonstrate two use cases for this API in R.

## Plot the global distribution of all sequences

```r
library(jsonlite)
library(ggplot2)

# Query the API
response <- fromJSON("https://lapis.cov-spectrum.org/open/v1/sample/aggregated?fields=region")

# Check for errors
errors <- response$errors
if (length(errors) > 0) {
  stop("Errors")
}

# Check for deprecation
deprecationDate <- response$info$deprecationDate
if (!is.null(deprecationDate)) {
  warning(paste0("This version of the API will be deprecated on ", deprecationDate,
                 ". Message: ", response$info$deprecationInfo))
}

# The data is good to be used!
data <- response$data

# Make a plot
ggplot(
  data,
  aes(x = "", y = count, fill = region)) + 
  geom_bar(width = 1, stat = "identity") + 
  coord_polar("y", start = 0) + 
  theme_minimal() + 
  theme(
    panel.grid=element_blank(),
    panel.border = element_blank(),
    axis.ticks = element_blank(),
    axis.title.x = element_blank(), 
    axis.title.y = element_blank(),
    axis.text.x = element_blank())
```


Steps:

1. Query data from the API
2. Check whether there are errors. If yes, abort!
3. Check whether a deprecation date is given. If yes, write a warning.
4. Parse data from JSON as a data frame.
5. Use the data frame to create a plot.

## Plot the count of delta samples in a country in the past 100 days

```r
library(jsonlite)
library(ggplot2)

# Query the API
date_from <- format(Sys.Date() - as.difftime(100, unit = "days"), "%Y-%m-%d")
query <- paste0(
  "https://lapis.cov-spectrum.org/open/v1/sample/aggregated?",
  "fields=date",
  "&country=Switzerland",
  "&dateFrom=", date_from,
  "&pangoLineage=B.1.617.2*"
)
response <- fromJSON(query)

# Check for errors
errors <- response$errors
if (length(errors) > 0) {
  stop("Errors")
}

# Check for deprecation
deprecationDate <- response$info$deprecationDate
if (!is.null(deprecationDate)) {
  warning(paste0("This version of the API will be deprecated on ", deprecationDate,
                 ". Message: ", response$info$deprecationInfo))
}

# The data is good to be used!
data <- response$data

# Make a plot
ggplot(
  data,
  aes(x = as.Date(date), y = count)) + 
  geom_col() + 
  theme_bw() + 
  labs(x = element_blank(), y = "Count") + 
  scale_x_date(date_breaks = "1 month", date_labels = "%B %Y") + 
  ggtitle("Count of delta samples in Switzerland in the past 100 days")
```

