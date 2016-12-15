(ns reagent-quill.core
    (:require [reagent.core :as reagent]
              [co.zensight.react-quill]))

(def quill-component (reagent/adapt-react-class js/ReactQuill))
