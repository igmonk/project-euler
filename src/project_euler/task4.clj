(ns project-euler.task4)

(defn palindrome?
  "Determines whether a number is a palindrome."
  [x]
  (let [s (str x)]
    (= s (clojure.string/reverse s))))

(defn largest-palindrome
  "Returns the largest palindrome made from the product of two 3-digit numbers."
  []
  (reduce max
          (filter palindrome?
                  (for [x (rseq (vec (range 100 1000)))
                        y (rseq (vec (range 100 1000)))]
                    (* x y)))))
