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

## Intro
Working toward "sharing secrets" using _polynomial interpolation_

## 2.1

A single variable _polynomial with real coefficents_ is a function $f$ that takes a real number as an input, produces a real number as output and has the form

$$ f(x) = a_{0}, + a_{1}x + a_{2}x^2 + ... + a_{n}x^n $$

where the $a_{i}$ are real numbers.

_coefficents_ : the numbers $a_{i}$
_degree_ : the integer $n$
  - the degree is the highest power of $x$ that appears in the polynomial
  - the number of terms in a polynomial is one more than its degree
    - this isn't really true if the expression simplifies down to less terms


A polynomial is any functon of a single numeric input that can be expressed using only addition, multiplication and constants, along with the input variable itself

A polynomial's graph can be plotted as s curve in space

$a_{i}$ is equivalent to array lookup: `a[i]`
$a_{i,j}$ is equivalent to nexted array lookup: `a[i][j]`


```clojure
(let [expr (fn [x] (- (expt x 5) x 1))]
  (mafs/of-x expr {:color :blue}))
```
$$ f(x) = x^5 - x - 1 $$


Boolean logic can be expressed as a polynomials (where $x$ is a boolean variable)

$$
AND(x, y) = xy
\newline
NOT (x) = 1 - x
\newline
OR(x, y) = 1 - (1 - x)(1 - y)
\newline
OR(x, y) = NOT(AND(NOT(x), NOT(y))
$$

## 2.3 Existence and Uniqueness

- [ ] stopped on p.15 theorum 2.2
