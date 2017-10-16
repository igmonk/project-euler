(ns project-euler.task9)

(def max-sum 1000)

;; (c >= a) AND (c >= b) => MAX(a+b) = 1000 * (2 / 3)
(def a-plus-b-max (* max-sum (/ 2 3)))

(defn- square
  [x]
  (* x x))

(defn- pythagorean-triplet?
  [a b c]
  (= (square c)
     (+ (square a)
        (square b))))

(defn- triplet-gen
  []
  (for [a (range 1 a-plus-b-max)
        b (range a (- a-plus-b-max a))]
    (let [c (- max-sum (+ a b))]
      [a b c])))

(defn- pythagorean-triplet
  [triplets]
  (let [triplet (first triplets)
        [a b c] triplet]
    (if (pythagorean-triplet? a b c)
      triplet
      (recur (rest triplets)))))

(defn abc
  []
  (let [triplets (triplet-gen)
        p-triplet (pythagorean-triplet triplets)
        [a b c] p-triplet]
    (* a b c)))
