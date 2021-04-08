(ns untitled.fi)
(def fib
  (map first (iterate
               (fn [[a b]] [b (+ a b)]) [0 1])))

(take 30 fib)