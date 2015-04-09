(ns build
  (:require [cljs.closure :as closure]))

(closure/build
 "src"
 {:main 'circular.core
  :output-to "out/main.js"
  :verbose true})
