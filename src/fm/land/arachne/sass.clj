(ns fm.land.arachne.sass
  "Utilities for working with SASS in Arachne"
  (:require [clojure.spec :as s]
            [fm.land.arachne.sass.schema :as schema]
            [arachne.error :as e :refer [deferror error]]
            [arachne.core.config :as cfg]
            [arachne.core.util :as u]))

(defn schema
  "Return the schema for the module"
  []
  schema/schema)

(defn configure
  "Configure the module"
  [cfg]
  cfg)
