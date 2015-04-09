(ns circular.core
  (:require [circular.core :refer [bar]]))

(defn foo []
  (println (bar)))

(foo)
