(function(){

    angular.module('outsourcing')
        .service('ClienteService', ClienteService);

    ClienteService.$inject = ['$http'];

    function ClienteService ($http) {
        var service = this;

        var URL = 'http://localhost:9090/clientes';

        service.findAll = function () {            
            return $http.get(URL)
                .then(function(response) {
                    return {
                        data: response.data
                    };
                });
        }

        service.findOne = function (id) {
            return $http.get(URL + '/' + id)
                .then(function(response) {
                    return response.data;
                });
        }

        service.insert = function (cliente) {
            return $http.post(URL, cliente)
                .then(function(response) {
                    return response.data;
                });
        }

        service.update = function (cliente) {
            return $http.put(URL + '/' + cliente.id, cliente)
                .then(function(response) {
                    return response.data;
                });
        }

        service.remove = function (id) {
            return $http.delete(URL + '/' + id);
        }

        return service;
    }

})();