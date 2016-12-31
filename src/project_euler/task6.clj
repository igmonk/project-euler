(ns project-euler.task6)

(defn execute
  []
  (let [nums (range 1 101)
        nums-sum (apply + nums)
        squares (map #(* % %) nums)]
    (- (* nums-sum nums-sum)
       (apply + squares))))
