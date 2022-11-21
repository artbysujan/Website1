let openButtons = document.querySelectorAll('[data-modal-target]')
let closeButtons = document.querySelectorAll('[data-close-button]')
let overlay = document.getElementById('overlay')




openButtons.forEach(button => {
  button.addEventListener('click', () => {
    let modal = document.querySelector(button.dataset.modalTarget)
    openModal(modal)
  })
})

closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/

closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal1')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/

/*-------------------------------------------------------------*/

closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal2')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal3')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal4')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal5')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal6')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal7')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal8')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/



closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal9')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal10')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal11')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal12')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal13')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal14')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/


closeButtons.forEach(button => {
    button.addEventListener('click', () => {
      let modal = button.closest('#modal15')
      closeModal(modal)
    })
  }) 

/*-------------------------------------------------------------*/
function openModal(modal) {
  if (modal == null) return
  modal.classList.add('active')
  overlay.classList.add('active')
}

function closeModal(modal) {
    if (modal == null) return
    modal.classList.remove('active')
    overlay.classList.remove('active')
  }
