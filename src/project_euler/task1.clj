(ns project-euler.task1)

(defn- isMultiplier?
  [x]
  (or (= (mod x 3) 0) (= (mod x 5) 0)))

(defn get-sum
  "Finds the sum of all the multiples of 3 or 5 below 1000."
  []
  (reduce + (filter isMultiplier? (range 3 1000))))

