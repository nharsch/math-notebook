(ns server
  (:require [nextjournal.clerk :as clerk]
            [mentat.clerk-utils.build :as b]))

(defn -main [& args]
  (b/serve! {:watch-paths ["notebooks"]
                 :browse? true
                 :port 6677}))
