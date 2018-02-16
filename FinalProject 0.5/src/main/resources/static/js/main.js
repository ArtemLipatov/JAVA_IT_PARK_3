function uploadFile(file) {
    var formData = new FormData();
    formData.append("file", file);

    $.ajax({
        type: "POST",
        url: "/files",
        data: formData,
        contentType: false,
        processData: false,
        success: function (data) {
            alert(data)
        },
        error: function (data) {
            alert(data.status);
        }
    })
}

function updateProfile(userId, firstName, lastName, organization, phonenumber) {
    $.ajax({
        type: "POST",
        url: "/users/${model.user.id}",
        data: {
            "userId" : userId,
            "firstName" : firstName,
            "lastName" : lastName,
            "organization" : organization,
            "phonenumber" : phonenumber
        },
        error: function (data) {
            alert(data.status)
        },
        success: function (data) {
            alert("Профиль был изменен.")
        }
    })

}