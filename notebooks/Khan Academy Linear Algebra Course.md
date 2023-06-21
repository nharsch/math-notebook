Source: https://www.khanacademy.org/math/linear-algebra
Author:
Topics: [[Linear Algebra]]
Type: 
Date: 2023-06-19

```clj
^:nextjournal.clerk/no-cache
(ns khan-la
  (:refer-clojure
   :exclude [+ - * / zero? compare divide numerator denominator
               infinite? abs ref partial =])
  (:require [emmy.env :as e :refer :all]
            ;; [emmy.clerk :as ec]
            ;; [emmy.leva :as leva]
            ;; [emmy.mafs :as mafs]
            ;; [emmy.mathbox.plot :as p]
            ;; [emmy.viewer :as ev]
            [nextjournal.clerk :as clerk]
            ))
```

## Vectors
- vectors have magnitude and direction
- vectors of same mag and direction but in different locations are _equivalent_
- vectors represented like this 

$$ \vec{v} = (0, 1) = \begin{bmatrix} 0 \\ 1 \end{bmatrix} $$

- can be represented as a pair or column vector

### The Real Coordinate Space
represented by $\mathbb{R}$

### Unit Vector
vector components between -1 and 1 represented with

$$ \hat{\imath} = \begin{bmatrix} 1 \\ 0 \end{bmatrix} $$
$$ \hat{\jmath} = \begin{bmatrix} 0 \\ 1 \end{bmatrix} $$
$$ \begin{bmatrix} 2 \\ 3 \end{bmatrix} = 2{\hat{\imath}} \cdot 3{\hat{\imath}} $$

### Parametric Representation of Lines
this describes a set of colinear vectors, where $S$ is the set of all vectors colinear with $\vec{V}$ in the real plane

$$ S = \left\{ c\vec{V} \space | \space c \in \mathbb{R} \right\}  $$

This describes a parallel line of $S$ offset by vector $\vec{X}$. For all points in $S$, add $\vec{X}$

$$ L = \left\{ \vec{X} + t\vec{V} \space | \space t\in\mathbb{R} \right\}$$
- I kinda bounced off this

- [ ] how to draw clerk 2d plane

```
(def render (comp clerk/tex ->TeX))
(render ('S = 'a))
(->infix (asin -10))
```

- [ ] left off [here](https://www.khanacademy.org/math/linear-algebra/vectors-and-spaces/linear-combinations/v/linear-combinations-and-span)

## Questions

related:
