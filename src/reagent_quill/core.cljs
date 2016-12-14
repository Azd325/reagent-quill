(ns reagent-quill.core
    (:require [reagent.core :as reagent]
              [react-quill :as react-quill]))

(def quill-component (reagent/adapt-react-class react-quill.component))
