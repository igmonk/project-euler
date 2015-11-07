(ns project-euler.task2)

(defn- fibonacci-numbers
  ([] (fibonacci-numbers 1 2))
  ([a b] (cons a (lazy-seq (fibonacci-numbers b (+ a b))))))

(defn- less-than-four-millions?
       [x]
       (< x 4000000))

(defn even-fibs
  "By considering the terms in the Fibonacci sequence (starting with 1 and 2)
   whose values do not exceed four million, find the sum of the even-valued terms."
  []
  (reduce + (filter even? (take-while less-than-four-millions? (fibonacci-numbers)))))
