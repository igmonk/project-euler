(ns project-euler.task6-test
  (:require [clojure.test :refer :all]
            [project-euler.task6 :refer :all]))

(deftest task6-test
  (testing "Task6"
    (is (= 25164150 (execute)))))
