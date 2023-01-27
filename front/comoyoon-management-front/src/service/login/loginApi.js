import axios from 'axios';

const instance = axios.create();
instance.defaults.headers.post['Content-Type'] = 'application/json'

instance.interceptors.response.use(response => {
    return response
}, err => {
    return Promise.reject(err)
})

export default {
    doLogin(data) {
        return instance.post('/api/login',data)
    }
}