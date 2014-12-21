package app

import grails.transaction.Transactional

@Transactional
class ItemService {

    String serviceMethod() {
        return 'Value from service'
    }
}
