(ns user
  (:require [nextjournal.clerk :as clerk]
            [emmy.clerk :as ec]))

(comment
  ;; start without file watcher, open browser when started
  (ec/serve! {:browse? true})

  ;; start with file watcher for these sub-directory paths
  (ec/serve! {:watch-paths ["notebooks" "src"]})

  ;; start with file watcher and a `show-filter-fn` function to watch
  ;; a subset of notebooks
  (ec/serve! {:watch-paths ["notebooks" "src"] :show-filter-fn #(clojure.string/starts-with? % "notebooks")})

  (ec/clear-cache!)

  ;; or call `ec/show!` explicitly
  (ec/show! "notebooks/introduction.clj")
  (ec/show! "notebooks/data_science.clj")
  (ec/show! "notebooks/sicmutils.clj")
  (ec/show! "notebooks/rule_30.clj")
  (ec/show! "notebooks/semantic.clj")
  (ec/show! "notebooks/images.clj")

  (ec/show! "index.md")

  ;; TODO If you would like more details about how Clerk works, here's a
  ;; notebook with some implementation details.
  ;; (ec/show! "notebooks/how_ec_works.clj")

  ;; produce a static app
  (ec/build-static-app! {:paths (mapv #(str "notebooks/" % ".clj")
                                         '[introduction data_science rule_30 semantic])})

  )
