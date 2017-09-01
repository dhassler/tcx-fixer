(ns tcx-fixer.core-test
  (:require [clojure.test :refer :all]
            [tcx-fixer.core :refer :all]
            [clojure.java.io :as io]))

(deftest test-tcx->map
  (testing "Basic parsing of the document"
    (let [input (io/resource "test.tcx")]
      (is (= "Polar Connect")
          (get-in (tcx->map input) [:Author :Name])
          ))))
