(ns project-euler.task4-test
  (:require [clojure.test :refer :all]
            [project-euler.task4 :refer :all]))

(deftest task4-test
  (testing "Task4"
    (is (= 906609 (largest-palindrome)))))
