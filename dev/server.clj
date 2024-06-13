(ns server
  (:require [nextjournal.clerk :as clerk]
            [emmy.clerk :as ec]
))

(defn -main [& args]
  (ec/serve! {:watch-paths ["notebooks"]
             :browse? true
             :port 6677}))
