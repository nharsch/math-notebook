# PIM CH 2

```clj
^:nextjournal.clerk/no-cache
(ns pim-ch2
  (:refer-clojure
   :exclude [+ - * / zero? compare divide numerator denominator
               infinite? abs ref partial =])
  (:require [emmy.env :as e :refer :all]
            [nextjournal.clerk :as clerk]
            [emmy.viewer :as ev]
            [emmy.clerk :as ec]
            [emmy.leva :as leva]
            [emmy.mafs :as mafs]
            [emmy.mathbox.plot :as plot]
            [clojure.math :as math]
            ))
(ec/install!)
```


```clj
(let [expr (= ((literal-function 'f) 'x) (- (expt 'x 5) 'x 1))]
  (freeze expr)
  ;; (->infix expr)
  ;; (clerk/tex (->TeX expr))
  ;; (mafs/of-x expr {:color :blue})
  )
```
