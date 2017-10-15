(ns project-euler.task2-test
  (:require [clojure.test :refer :all]
            [project-euler.task2 :refer :all]))

(deftest task2-test
  (testing "Task2"
    (is (= 4613732 (even-fibs)))))
