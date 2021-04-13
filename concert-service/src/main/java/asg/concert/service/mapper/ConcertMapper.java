package asg.concert.service.mapper;

import asg.concert.common.dto.ConcertDTO;
import asg.concert.service.domain.Concert;


public class ConcertMapper {
    static Concert toDomainModel(ConcertDTO concertDTO){
        Concert fullConcert = new Concert(concertDTO.getId(),
                concertDTO.getTitle(),
                concertDTO.getImageName(),
                concertDTO.getBlurb());
        return fullConcert;
    }
    static ConcertDTO toDto(Concert concert){
        ConcertDTO ConcertDto = new ConcertDTO(concert.getId(),
                concert.getTitle(),
                concert.getImageName(),
                concert.getBlurb());
        return ConcertDto;
    }

}
