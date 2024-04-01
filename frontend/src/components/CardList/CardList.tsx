import { Flex } from "@chakra-ui/react";
import { RootState } from "../../features/store/store";
import { useSelector } from "react-redux";
import ProductCard from "./ProductCard";

const CardList: React.FC = () => {
  const cards = useSelector((state: RootState) => state.cards.cards);

  return (
    <Flex
      gap='40px 48px'
      width={1064}
      alignItems='flex-start'
      alignContent='flex-start'
      flexWrap='wrap'
      m={45}>
      {cards.map((card) => (
        <ProductCard key={card.id} {...card} />
      ))}
    </Flex>
  );
};

export default CardList;
