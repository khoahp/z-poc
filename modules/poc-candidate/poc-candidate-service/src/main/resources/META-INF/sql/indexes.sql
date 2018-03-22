create index IX_F4EDC516 on zhr_Candidate (companyId, groupId, status);
create index IX_88BEE22 on zhr_Candidate (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_931D9524 on zhr_Candidate (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_315444AB on zhr_HrAction (companyId, groupId, candidateId);
create index IX_4D02CF95 on zhr_HrAction (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_62B43757 on zhr_HrAction (uuid_[$COLUMN_LENGTH:75$], groupId);