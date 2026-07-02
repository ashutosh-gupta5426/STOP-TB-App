package org.piramalswasthya.stoptb.ui.counselling_activity

var Counselling_Json_Response =
"""
{
  "success": true,
  "message": null,
  "data": [
    {
      "formId": 22,
      "formUuid": "TB_COUNSELLING",
      "formName": "TB Counselling",
      "formType":yes  "TB_COUNSELLING",
      "isActive": true,
      "followUpDelayDays": 15,
      "versionNumber": 1,
      "sections": [
        {
          "sectionId": 22,
          "sectionUuid": "TB_SEC_A",
          "sectionName": "Disease Awareness",
          "sectionNameHindi": "?????? ?? ???? ??? ????????",
          "sectionPhase": "PRE_SUBMIT",
          "isRequired": true,
          "displayOrder": 1,
          "hasSubmitButton": false,
          "questions": [
            {
              "questionId": 21,
              "questionUuid": "TB_A_Q1",
              "questionText": "TB disease explained to patient",
              "questionTextHindi": "????? ?? ???? ?????? ?? ???? ??? ?????? ????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 1,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 2,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 22,
              "questionUuid": "TB_A_Q2",
              "questionText": "Transmission route explained",
              "questionTextHindi": "?????????? ?? ????? ?? ???? ??? ???????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 2,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 3,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 4,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 23,
              "questionUuid": "TB_A_Q3",
              "questionText": "Symptoms explained",
              "questionTextHindi": "??????? ?? ???????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 3,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 5,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 6,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 24,
              "questionUuid": "TB_A_Q4",
              "questionText": "Treatment duration explained",
              "questionTextHindi": "???? ?? ???? ?? ???? ??? ???????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 4,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 7,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 8,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 25,
              "questionUuid": "TB_A_REMARKS",
              "questionText": "Disease awareness notes",
              "questionTextHindi": "?????? ?? ???? ??? ??????? ???? ???? ?????",
              "questionType": "TEXT",
              "isMandatory": false,
              "displayOrder": 5,
              "maxLength": 500,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [],
              "validations": [
                {
                  "validationId": 1,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "500",
                  "errorMessage": "Must be 500 characters or fewer"
                }
              ]
            }
          ],
          "isEditable": false
        },
        {
          "sectionId": 23,
          "sectionUuid": "TB_SEC_B",
          "sectionName": "Do's and Don'ts",
          "sectionNameHindi": "??? ?? ?? ???",
          "sectionPhase": "PRE_SUBMIT",
          "isRequired": true,
          "displayOrder": 2,
          "hasSubmitButton": false,
          "questions": [
            {
              "questionId": 26,
              "questionUuid": "TB_B_Q1",
              "questionText": "Cover mouth while coughing ? advised",
              "questionTextHindi": "?????? ??? ???? ???? ?? ???? ?? ???? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 9,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 10,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 27,
              "questionUuid": "TB_B_Q2",
              "questionText": "Complete full treatment course ? advised",
              "questionTextHindi": "???? ?? ???? ????? ???? ???? ?? ???? ?? ???? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 2,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 11,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 12,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 28,
              "questionUuid": "TB_B_Q3",
              "questionText": "Regular follow-up attendance ? advised",
              "questionTextHindi": "???? ?? ???? ????? ???? ???? ?? ???? ?? ???? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 3,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 13,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 14,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 29,
              "questionUuid": "TB_B_Q4",
              "questionText": "Nutritional guidance provided",
              "questionTextHindi": "???? ?????? ?????????? ?????? ???? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 4,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 15,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 16,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 30,
              "questionUuid": "TB_B_Q5",
              "questionText": "No smoking / alcohol ? advised",
              "questionTextHindi": "???????? / ???? ? ???? ?? ???? ?? ???? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 5,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 17,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 18,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 31,
              "questionUuid": "TB_B_Q6",
              "questionText": "Isolation precautions explained",
              "questionTextHindi": "????? ?????????? ?? ???? ??? ????? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 6,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 19,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 20,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 32,
              "questionUuid": "TB_B_REMARKS",
              "questionText": "Do's & Don'ts notes",
              "questionTextHindi": "???? ???? ?? ???? ? ???? - ?????",
              "questionType": "TEXT",
              "isMandatory": false,
              "displayOrder": 7,
              "maxLength": 500,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [],
              "validations": [
                {
                  "validationId": 2,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "500",
                  "errorMessage": "Must be 500 characters or fewer"
                }
              ]
            }
          ],
          "isEditable": false
        },
        {
          "sectionId": 24,
          "sectionUuid": "TB_SEC_C",
          "sectionName": "Government Schemes",
          "sectionNameHindi": "?????? ???????",
          "sectionPhase": "PRE_SUBMIT",
          "isRequired": false,
          "displayOrder": 3,
          "hasSubmitButton": false,
          "questions": [
            {
              "questionId": 33,
              "questionUuid": "TB_C_Q1",
              "questionText": "Nikshay Poshan Yojana (NPY) eligibility explained",
              "questionTextHindi": "?????? ???? ????? (???????) ??????? ?? ???? ??? ????? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 21,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 22,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 34,
              "questionUuid": "TB_C_Q2",
              "questionText": "DOTS free treatment explained",
              "questionTextHindi": "DOTS ?????? ???? ?? ???? ??? ???????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 2,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 23,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 24,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 35,
              "questionUuid": "TB_C_REMARKS",
              "questionText": "Schemes notes",
              "questionTextHindi": "??????? ?? ?????",
              "questionType": "TEXT",
              "isMandatory": false,
              "displayOrder": 3,
              "maxLength": 300,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [],
              "validations": [
                {
                  "validationId": 3,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "300",
                  "errorMessage": "Must be 300 characters or fewer"
                }
              ]
            }
          ],
          "isEditable": false
        },
        {
          "sectionId": 25,
          "sectionUuid": "TB_SEC_D",
          "sectionName": "Treatment Regimen",
          "sectionNameHindi": "???? ?? ?????",
          "sectionPhase": "PRE_SUBMIT",
          "isRequired": true,
          "displayOrder": 4,
          "hasSubmitButton": false,
          "questions": [
            {
              "questionId": 36,
              "questionUuid": "TB_D_Q1",
              "questionText": "Regimen explained to patient",
              "questionTextHindi": "????? ?? ???? ?? ????? ?????? ????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 25,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 26,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 37,
              "questionUuid": "TB_D_Q2",
              "questionText": "Medication names explained",
              "questionTextHindi": "????? ?? ????? ?? ???????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 2,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 27,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 28,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 38,
              "questionUuid": "TB_D_Q3",
              "questionText": "Side effects explained",
              "questionTextHindi": "???? ????????? ?? ???? ??? ???????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 3,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 29,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 30,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 39,
              "questionUuid": "TB_D_Q4",
              "questionText": "Importance of adherence explained",
              "questionTextHindi": "????????? ?? ???? ???? ?? ????? ?????? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 4,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 31,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 32,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 40,
              "questionUuid": "TB_D_REMARKS",
              "questionText": "Treatment regimen notes",
              "questionTextHindi": "???? ?? ????? ?? ???? ?????",
              "questionType": "TEXT",
              "isMandatory": false,
              "displayOrder": 5,
              "maxLength": 300,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [],
              "validations": [
                {
                  "validationId": 4,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "300",
                  "errorMessage": "Must be 300 characters or fewer"
                }
              ]
            }
          ],
          "isEditable": false
        },
        {
          "sectionId": 26,
          "sectionUuid": "TB_SEC_E",
          "sectionName": "Counselling Completion",
          "sectionNameHindi": "????????? ???? ????",
          "sectionPhase": "PRE_SUBMIT",
          "isRequired": true,
          "displayOrder": 5,
          "hasSubmitButton": true,
          "questions": [
            {
              "questionId": 41,
              "questionUuid": "TB_E_Q1",
              "questionText": "Counselling completion status",
              "questionTextHindi": "????????? ???? ???? ?? ??????",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 33,
                  "optionLabel": "Complete",
                  "optionLabelHindi": "????????",
                  "optionValue": "COMPLETE",
                  "optionValueHindi": "????????",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 34,
                  "optionLabel": "Refused",
                  "optionLabelHindi": "???????? ????",
                  "optionValue": "REFUSED",
                  "optionValueHindi": "???????? ????",
                  "displayOrder": 2,
                  "conditions": [
                    {
                      "conditionId": 1,
                      "actionType": "DISABLE_SECTION_VALIDATION",
                      "targetQuestionId": null,
                      "targetSectionId": 22,
                      "targetQuestionUuid": null,
                      "targetSectionUuid": "TB_SEC_A"
                    },
                    {
                      "conditionId": 2,
                      "actionType": "DISABLE_SECTION_VALIDATION",
                      "targetQuestionId": null,
                      "targetSectionId": 23,
                      "targetQuestionUuid": null,
                      "targetSectionUuid": "TB_SEC_B"
                    },
                    {
                      "conditionId": 3,
                      "actionType": "DISABLE_SECTION_VALIDATION",
                      "targetQuestionId": null,
                      "targetSectionId": 24,
                      "targetQuestionUuid": null,
                      "targetSectionUuid": "TB_SEC_C"
                    },
                    {
                      "conditionId": 4,
                      "actionType": "DISABLE_SECTION_VALIDATION",
                      "targetQuestionId": null,
                      "targetSectionId": 25,
                      "targetQuestionUuid": null,
                      "targetSectionUuid": "TB_SEC_D"
                    },
                    {
                      "conditionId": 5,
                      "actionType": "SHOW_QUESTION",
                      "targetQuestionId": 42,
                      "targetSectionId": null,
                      "targetQuestionUuid": "TB_E_REFUSAL",
                      "targetSectionUuid": null
                    }
                  ]
                }
              ],
              "validations": []
            },
            {
              "questionId": 42,
              "questionUuid": "TB_E_REFUSAL",
              "questionText": "Reason for refusal",
              "questionTextHindi": "????? ?? ????",
              "questionType": "TEXT",
              "isMandatory": true,
              "displayOrder": 2,
              "maxLength": 300,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": false,
              "options": [],
              "validations": [
                {
                  "validationId": 5,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "300",
                  "errorMessage": "Must be 300 characters or fewer"
                }
              ]
            },
            {
              "questionId": 43,
              "questionUuid": "TB_E_REMARKS",
              "questionText": "Counsellor remarks",
              "questionTextHindi": "??????? ?? ???????",
              "questionType": "TEXT",
              "isMandatory": false,
              "displayOrder": 3,
              "maxLength": 500,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [],
              "validations": [
                {
                  "validationId": 6,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "500",
                  "errorMessage": "Must be 500 characters or fewer"
                }
              ]
            }
          ],
          "isEditable": false
        },
        {
          "sectionId": 27,
          "sectionUuid": "TB_SEC_F",
          "sectionName": "Follow Up to TU",
          "sectionNameHindi": "TU ?? ??? ?? ????????",
          "sectionPhase": "POST_SUBMIT",
          "isRequired": true,
          "displayOrder": 6,
          "hasSubmitButton": true,
          "questions": [
            {
              "questionId": 44,
              "questionUuid": "TB_F_Q1",
              "questionText": "Has the patient started the prescribed TB treatment regimen?",
              "questionTextHindi": "???? ????? ?? ???? ?? ??? ????? ??? ???? ???? ?? ???? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 35,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 36,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": [
                    {
                      "conditionId": 6,
                      "actionType": "SHOW_QUESTION",
                      "targetQuestionId": 45,
                      "targetSectionId": null,
                      "targetQuestionUuid": "TB_F_NO_REASON",
                      "targetSectionUuid": null
                    }
                  ]
                }
              ],
              "validations": []
            },
            {
              "questionId": 45,
              "questionUuid": "TB_F_NO_REASON",
              "questionText": "Reason for not starting the prescribed TB treatment regimen",
              "questionTextHindi": "???? ?? ??? ?? ???? ?? ????? ???? ? ???? ?? ????",
              "questionType": "TEXT",
              "isMandatory": false,
              "displayOrder": 2,
              "maxLength": 500,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": false,
              "options": [],
              "validations": [
                {
                  "validationId": 7,
                  "validationType": "MAX_LENGTH",
                  "validationParam": "500",
                  "errorMessage": "Must be 500 characters or fewer"
                }
              ]
            },
            {
              "questionId": 46,
              "questionUuid": "TB_F_Q2",
              "questionText": "Has the patient visited the DOTS centre / referred health facility for treatment collection?",
              "questionTextHindi": "???? ????? ???? ???? ?? ??? DOTS ????? ?? ???? ??? ?? ????????? ?????? ??? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 3,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 37,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 38,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            },
            {
              "questionId": 47,
              "questionUuid": "TB_F_Q3",
              "questionText": "Has the patient reported side effects to the treating doctor or DOTS centre?",
              "questionTextHindi": "???? ????? ?? ???? ???? ???? ?????? ?? DOTS ????? ?? ???? ????????? ?? ???? ??? ????? ???",
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 4,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 39,
                  "optionLabel": "Yes",
                  "optionLabelHindi": "???",
                  "optionValue": "YES",
                  "optionValueHindi": "???",
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 40,
                  "optionLabel": "No",
                  "optionLabelHindi": "????",
                  "optionValue": "NO",
                  "optionValueHindi": "????",
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            }
          ],
          "isEditable": false
        }
      ]
    },
    {
      "formId": 23,
      "formUuid": "tb-screening-form-001",
      "formName": "TB Screening Form",
      "formType": "SCREENING",
      "isActive": true,
      "followUpDelayDays": 7,
      "versionNumber": 7,
      "sections": [
        {
          "sectionId": 34,
          "sectionUuid": "sec-001",
          "sectionName": "Symptoms",
          "sectionNameHindi": null,
          "sectionPhase": "PRE_SUBMIT",
          "isRequired": true,
          "displayOrder": 1,
          "hasSubmitButton": true,
          "questions": [
            {
              "questionId": 55,
              "questionUuid": "q-001",
              "questionText": "Do you have a persistent cough?",
              "questionTextHindi": null,
              "questionType": "RADIO",
              "isMandatory": true,
              "displayOrder": 1,
              "maxLength": null,
              "defaultValue": null,
              "containsPii": false,
              "visibleByDefault": true,
              "options": [
                {
                  "optionId": 53,
                  "optionLabel": "Yes",
                  "optionLabelHindi": null,
                  "optionValue": "YES",
                  "optionValueHindi": null,
                  "displayOrder": 1,
                  "conditions": []
                },
                {
                  "optionId": 54,
                  "optionLabel": "No",
                  "optionLabelHindi": null,
                  "optionValue": "NO",
                  "optionValueHindi": null,
                  "displayOrder": 2,
                  "conditions": []
                }
              ],
              "validations": []
            }
          ],
          "isEditable": false
        }
      ]
    }
  ]
}
    
""".trimIndent()