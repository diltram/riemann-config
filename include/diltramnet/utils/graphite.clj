(ns diltramnet.utils.graphite
  (:require [riemann.config :refer :all]
            [riemann.graphite :refer :all]))

(defn add-environment-to-graphite [event] (str "home.diltram.net", (riemann.graphite/graphite-path-percentiles event)))

(def graph (async-queue! :graphite {:queue-size 1000}
            (graphite {:host "dilu-monitoring" :path add-environment-to-graphite})))
