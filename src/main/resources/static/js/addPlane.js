const addPlaneForm = document.getElementById("addAircraftForm")
addPlaneForm.addEventListener("submit", e=> {
    e.preventDefault()

    const formData = new FormData(addPlaneForm)
    const object = {
    }
    formData.forEach((value, key) => {
        console.log(value)
        console.log(key)
        object[key] = value;
    });
    console.log(object)
    fetch("api/plans/aircraft", {
        method:"POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify(object)
    })
        .then(() => getPlanes())
        .then(addPlaneForm.reset())
})