(defn head
  [body]
  [:html
   [:head
    [:link {:rel "stylesheet" :href "/static/css/bass.css"}]
    [:meta {:charset "UTF-8"}]
    [:link {:rel "stylesheet" :href "/static/css/main.css"}]]
   body])
