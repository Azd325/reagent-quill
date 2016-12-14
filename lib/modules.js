function exported_require (name) {
    switch (name) {
    case "react-quill":        return require("react-quill");
    default:
        console.error("Unknown module: ", name);
    }
}

if (!global.require) {
    global.require = exported_require;
}
