const addFlightPlanForm = document.getElementById("addFlightPlanForm")
addFlightPlanForm.addEventListener("submit", e => {
    e.preventDefault()

    const formData = new FormData(addFlightPlanForm)
    const object = {}
    formData.forEach((value, key) => {
        object[key] = value;
    })
    console.log(object)
    fetch("api/plans", {
        method:"POST",
        headers: {
            "Content-type": "application/json"
        },
        body: JSON.stringify(object)
    })
        .then(() => updateFlightPlan())
        .then(addFlightPlanForm.reset())
})