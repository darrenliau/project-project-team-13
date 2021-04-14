package asg.concert.service.mapper;

import asg.concert.common.dto.SeatDTO;
import asg.concert.service.domain.Seat;

public class SeatMapper {
    static Seat toDomainModel(SeatDTO seatDTO) {
        Seat fullSeat= new Seat(seatDTO.getLabel(),
                seatDTO.getPrice());
        return fullSeat;
    }

    static SeatDTO toDto(Seat seat) {
        SeatDTO seatDTO = new SeatDTO(seat.getLabel(),
                        seat.getPrice());

        return seatDTO;
    }
}
