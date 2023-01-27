const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  devServer: {
    proxy: 'http://52.79.49.1:419'
  },
  transpileDependencies: true
})
