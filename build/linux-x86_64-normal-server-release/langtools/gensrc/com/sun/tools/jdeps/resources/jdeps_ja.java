package com.sun.tools.jdeps.resources;

public final class jdeps_ja extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "artifact.not.found", "\u898B\u3064\u304B\u308A\u307E\u305B\u3093" },
            { "err.dot.output.path", "\u7121\u52B9\u306A\u30D1\u30B9: {0}" },
            { "err.internal.error", "\u5185\u90E8\u30A8\u30E9\u30FC: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u5F15\u6570\u304C\u7121\u52B9\u3067\u3059: {0}" },
            { "err.missing.arg", "{0}\u306B\u5024\u304C\u6307\u5B9A\u3055\u308C\u3066\u3044\u307E\u305B\u3093" },
            { "err.option.after.class", "\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u30AF\u30E9\u30B9\u306E\u524D\u306B\u6307\u5B9A\u3059\u308B\u5FC5\u8981\u304C\u3042\u308A\u307E\u3059: {0}" },
            { "err.option.unsupported", "{0}\u306F\u30B5\u30DD\u30FC\u30C8\u3055\u308C\u3066\u3044\u307E\u305B\u3093: {1}" },
            { "err.profiles.msg", "\u30D7\u30ED\u30D5\u30A1\u30A4\u30EB\u60C5\u5831\u304C\u3042\u308A\u307E\u305B\u3093" },
            { "err.unknown.option", "\u4E0D\u660E\u306A\u30AA\u30D7\u30B7\u30E7\u30F3: {0}" },
            { "error.prefix", "\u30A8\u30E9\u30FC:" },
            { "main.opt.P", "  -P           -profile              \u30D7\u30ED\u30D5\u30A1\u30A4\u30EB\u3001\u307E\u305F\u306F\u30D1\u30C3\u30B1\u30FC\u30B8\u3092\u542B\u3080\u30D5\u30A1\u30A4\u30EB\u3092\u8868\u793A\u3057\u307E\u3059" },
            { "main.opt.R", "  -R           -recursive            \u3059\u3079\u3066\u306E\u4F9D\u5B58\u6027\u3092\u53CD\u5FA9\u7684\u306B\u8D70\u67FB\u3057\u307E\u3059" },
            { "main.opt.apionly", "  -apionly                           \u5206\u6790\u3092API\u3001\u3064\u307E\u308A\u3001\u30D1\u30D6\u30EA\u30C3\u30AF\u30FB\u30AF\u30E9\u30B9\u306E\n                                     \u30D1\u30D6\u30EA\u30C3\u30AF\u30FB\u30E1\u30F3\u30D0\u30FC\u304A\u3088\u3073\u4FDD\u8B77\u3055\u308C\u305F\u30E1\u30F3\u30D0\u30FC\u306E\n                                     \u7F72\u540D\u306B\u304A\u3051\u308B\u4F9D\u5B58\u6027(\u30D5\u30A3\u30FC\u30EB\u30C9\u30FB\u30BF\u30A4\u30D7\u3001\u30E1\u30BD\u30C3\u30C9\u30FB\n                                     \u30D1\u30E9\u30E1\u30FC\u30BF\u30FB\u30BF\u30A4\u30D7\u3001\u623B\u3055\u308C\u305F\u30BF\u30A4\u30D7\u3001\u30C1\u30A7\u30C3\u30AF\u3055\u308C\u305F\n                                     \u4F8B\u5916\u30BF\u30A4\u30D7\u306A\u3069)\u306B\u5236\u9650\u3057\u307E\u3059" },
            { "main.opt.cp", "  -cp <path>   -classpath <path>     \u30AF\u30E9\u30B9\u30FB\u30D5\u30A1\u30A4\u30EB\u3092\u691C\u7D22\u3059\u308B\u5834\u6240\u3092\u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.depth", "  -depth=<depth>                     \u63A8\u79FB\u7684\u306A\u4F9D\u5B58\u6027\u5206\u6790\u306E\u6DF1\u3055\u3092\n                                     \u6307\u5B9A\u3057\u307E\u3059" },
            { "main.opt.dotoutput", "  -dotoutput <dir>                   DOT\u30D5\u30A1\u30A4\u30EB\u51FA\u529B\u306E\u5B9B\u5148\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA" },
            { "main.opt.e", "  -e <regex>   -regex <regex>        \u30D1\u30BF\u30FC\u30F3\u306B\u4E00\u81F4\u3059\u308B\u30D1\u30C3\u30B1\u30FC\u30B8\u5185\u306E\u4F9D\u5B58\u6027\u3092\u691C\u51FA\u3057\u307E\u3059\n                                     (-p\u3068-e\u306F\u6392\u4ED6\u7684)" },
            { "main.opt.h", "  -h -?        -help                 \u3053\u306E\u4F7F\u7528\u65B9\u6CD5\u306E\u30E1\u30C3\u30BB\u30FC\u30B8\u3092\u51FA\u529B\u3057\u307E\u3059" },
            { "main.opt.include", "  -include <regex>                   \u30D1\u30BF\u30FC\u30F3\u306B\u4E00\u81F4\u3059\u308B\u30AF\u30E9\u30B9\u306B\u5206\u6790\u3092\u5236\u9650\u3057\u307E\u3059\n                                     \u3053\u306E\u30AA\u30D7\u30B7\u30E7\u30F3\u3092\u6307\u5B9A\u3059\u308B\u3068\u3001\u5206\u6790\u5BFE\u8C61\u30AF\u30E9\u30B9\u306E\n                                     \u30EA\u30B9\u30C8\u304C\u30D5\u30A3\u30EB\u30BF\u51E6\u7406\u3055\u308C\u307E\u3059\u3002\u30D1\u30BF\u30FC\u30F3\u3092\u4F9D\u5B58\u6027\u306B\n                                     \u9069\u7528\u3059\u308B-p\u304A\u3088\u3073-e\u3068\u4E00\u7DD2\u306B\u4F7F\u7528\u3067\u304D\u307E\u3059" },
            { "main.opt.p", "  -p <pkgname> -package <pkgname>    \u6307\u5B9A\u306E\u30D1\u30C3\u30B1\u30FC\u30B8\u5185\u306E\u4F9D\u5B58\u6027\u3092\u691C\u51FA\u3057\u307E\u3059\n                                     (\u8907\u6570\u56DE\u6307\u5B9A\u53EF\u80FD)" },
            { "main.opt.s", "  -s           -summary              \u4F9D\u5B58\u6027\u306E\u8981\u7D04\u306E\u307F\u51FA\u529B\u3057\u307E\u3059" },
            { "main.opt.v", "  -v           -verbose              \u30AF\u30E9\u30B9\u30FB\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u3059\u3079\u3066\u51FA\u529B\u3057\u307E\u3059\n  -verbose:package                   \u30D1\u30C3\u30B1\u30FC\u30B8\u30FB\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u51FA\u529B\u3057\u307E\u3059\n                                     (\u540C\u3058\u30A2\u30FC\u30AB\u30A4\u30D6\u5185\u306E\u4F9D\u5B58\u6027\u3092\u9664\u304F)\n  -verbose:class                     \u30AF\u30E9\u30B9\u30FB\u30EC\u30D9\u30EB\u306E\u4F9D\u5B58\u6027\u3092\u51FA\u529B\u3057\u307E\u3059\n                                     (\u540C\u3058\u30A2\u30FC\u30AB\u30A4\u30D6\u5185\u306E\u4F9D\u5B58\u6027\u3092\u9664\u304F)" },
            { "main.opt.version", "  -version                           \u30D0\u30FC\u30B8\u30E7\u30F3\u60C5\u5831" },
            { "main.usage", "\u4F7F\u7528\u65B9\u6CD5: {0} <options> <classes...>\n<classes>\u306B\u306F\u3001.class\u30D5\u30A1\u30A4\u30EB\u306E\u30D1\u30B9\u540D\u3001\u30C7\u30A3\u30EC\u30AF\u30C8\u30EA\u3001JAR\u30D5\u30A1\u30A4\u30EB\u307E\u305F\u306F\u5B8C\u5168\u4FEE\u98FE\n\u30AF\u30E9\u30B9\u540D\u3092\u6307\u5B9A\u3067\u304D\u307E\u3059\u3002\u4F7F\u7528\u3067\u304D\u308B\u30AA\u30D7\u30B7\u30E7\u30F3\u306F\u6B21\u306E\u3068\u304A\u308A\u3067\u3059:" },
            { "main.usage.summary", "\u4F7F\u7528\u65B9\u6CD5: {0} <options> <classes...>\n\u4F7F\u7528\u53EF\u80FD\u306A\u30AA\u30D7\u30B7\u30E7\u30F3\u306E\u30EA\u30B9\u30C8\u306B\u3064\u3044\u3066\u306F\u3001-h\u3001-?\u307E\u305F\u306F--help\u3092\u4F7F\u7528\u3057\u307E\u3059" },
            { "warn.invalid.arg", "\u7121\u52B9\u306A\u30AF\u30E9\u30B9\u540D\u307E\u305F\u306F\u30D1\u30B9\u540D\u304C\u5B58\u5728\u3057\u307E\u305B\u3093: {0}" },
            { "warn.prefix", "\u8B66\u544A:" },
            { "warn.split.package", "\u30D1\u30C3\u30B1\u30FC\u30B8{0}\u306F{1} {2}\u3067\u5B9A\u7FA9\u3055\u308C\u3066\u3044\u307E\u3059" },
        };
    }
}