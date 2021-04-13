package asg.concert.service.mapper;


import asg.concert.common.dto.PerformerDTO;
import asg.concert.service.domain.Performer;

public class PerformerMapper {
    static Performer toDomainModel(PerformerDTO performerDTO) {
        Performer fullPerformer = new Performer(performerDTO.getId(),
                performerDTO.getName(),
                performerDTO.getImageName(),
                performerDTO.getGenre(),
                performerDTO.getBlurb());
        return fullPerformer;
    }

    static PerformerDTO toDto(Performer performer) {
        PerformerDTO performerDto =
                new PerformerDTO(
                        performer.getId(),
                        performer.getName(),
                        performer.getImageName(),
                        performer.getGenre(),
                        performer.getBlurb());
        return performerDto;
    }
}
