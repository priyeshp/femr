package femr.business.services;

import femr.business.dtos.ServiceResponse;
import femr.common.models.IPatientEncounterHpiField;
import femr.common.models.IPatientEncounterTreatmentField;
import femr.common.models.IPatientPrescription;
import org.joda.time.DateTime;

public interface IMedicalService {
    ServiceResponse<IPatientEncounterTreatmentField> createPatientEncounterTreatmentField(IPatientEncounterTreatmentField patientEncounterTreatmentField);

    ServiceResponse<IPatientEncounterHpiField> createPatientEncounterHpiField(IPatientEncounterHpiField patientEncounterHpiField);

    ServiceResponse<IPatientPrescription> createPatientPrescription(IPatientPrescription patientPrescription);

    boolean hasPatientBeenCheckedIn(int encounterId);
    public ServiceResponse<DateTime> getDateOfCheckIn(int encounterId);
}
