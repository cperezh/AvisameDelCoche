/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var phonecatApp = angular.module('phonecatApp', []);

phonecatApp.controller('PhoneListCtrl',
        function ($scope) {
            $scope.phones = [
                {'name': 'Nexus S',
                    'snippet': 'Fast just got faster with Nexus S.'},
                {'name': 'Motorola XOOM™ with Wi-Fi',
                    'snippet': 'The Next, Next Generation tablet.'},
                {'name': 'MOTOROLA XOOM™',
                    'snippet': 'The Next, Next Generation tablet.'}
            ];
            $scope.name = "World";
        });

phonecatApp.controller('PhoneListCtrl2',
        function ($scope) {
            $scope.enviar2 = function (name) {
                alert('Hello ' + (name || 'world') + '!');
            };
        });

phonecatApp.controller('PhoneListCtrl2',
        function ($scope) {
            $scope.enviar = function (name) {
                alert('Hello ' + (name || 'world') + '!');
            };
        });
