(ns diltramnet.utils.email
  (:require [riemann.email :refer :all]))

(def email (mailer {:from "reimann@diltram.net"}))
