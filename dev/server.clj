(ns server
  (:require [nextjournal.clerk :as clerk]))

(defn -main [& args]
  (clerk/serve! {:watch-paths ["notebooks" "src"]
                 :browse? true
                 :port 6677}))
