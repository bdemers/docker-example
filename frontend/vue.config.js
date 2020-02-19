function proxyTarget() {
    const targetUrl = process.env.PROXY_TARGET_URL || "http://localhost:8080";
    console.log("proxy target URL: " + targetUrl);
    return targetUrl;
}

module.exports = {
    devServer: {
        port: 8081,
        proxy: {
            "/stormtroopers": {
                target: proxyTarget(),
                secure: false
            }
        }
    }
};