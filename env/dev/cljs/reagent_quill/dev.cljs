(ns ^:figwheel-no-load reagent-quill.dev
  (:require [reagent.core :as reagent]
            [reagent-quill.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

(enable-console-print!)

(defn boot-demo-app []
  (reagent/render [core/quill-component {:theme "snow"}] (.getElementById js/document "app")))

(figwheel/watch-and-reload
  :websocket-url "ws://localhost:3450/figwheel-ws"
  :jsload-callback boot-demo-app)

(boot-demo-app)
