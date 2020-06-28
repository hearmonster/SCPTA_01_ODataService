For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file IncidentSet.json:

''' JSON
[
    {
        "IncidentCategory": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "IncidentDate": "2020-06-28T21:19:00.367Z",
        "IncidentDescription": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "IncidentID": "101",
        "IncidentLocatioon": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "IncidentPhoto": "QUJDREVGR0hJSktMTU5PUFFSU1RVVldYWVo=",
        "IncidentStatus": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "ReportedBy": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "UrgencyLevel": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "IncidentCategory": null,
        "IncidentDate": null,
        "IncidentDescription": null,
        "IncidentID": "102",
        "IncidentLocatioon": null,
        "IncidentPhoto": null,
        "IncidentStatus": null,
        "ReportedBy": null,
        "UrgencyLevel": null
    }
]
'''
