(function(){

    angular.module('outsourcing')
        .controller('ClienteListController', ClienteListController);

    ClienteListController.$inject = ['ClienteService'];

    function ClienteListController (ClienteService) {
        var vm = this;
        vm.clientes = [];

        function _load() {
            ClienteService.findAll()
                .then(function(data) {
                    vm.clientes = data.data;
                });
        }
        _load();
        
        vm.remove = function (id) {
            if (confirm('Deseja realmente excluir o cliente?')) {
                ClienteService.remove(id)
                    .then(function () {
                        alert('Cliente excluído com sucesso!');
                        _load();
                    })
                    .catch(function (error) {
                        alert('Problemas ao excluir o cliente [' + error.code + ']!');
                    });

            }
        }
    }

})();

