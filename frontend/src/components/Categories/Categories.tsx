import {
  Accordion,
  Box,
  extendTheme,
  ChakraProvider,
  Flex,
} from "@chakra-ui/react";
import SearchFilter from "./AccordionItems/SearchFilter";
import CategoriesFilter from "./AccordionItems/CategoriesFilter";
import BrandsFilter from "./AccordionItems/BrandsFilter";
import SizeFilter from "./AccordionItems/SizeFilter";
import ColourFilter from "./AccordionItems/ColourFilter";
import PriceFilter from "./AccordionItems/PriceFilter";
import MainButton from "../Buttons/MainButton";

const Categories: React.FC = () => {
  const theme = extendTheme({
    components: {
      Checkbox: {
        baseStyle: {
          control: {
            borderColor: "#919191",
          },
        },
      },
    },
    fonts: {
      body: "",
    },
    colors: {
      brand: {
        500: "#9169F7",
      },
    },
  });

  return (
    <ChakraProvider theme={theme}>
      <Flex w={"254px"} flexDir={'column'}>
        <Box as='button' color={"#9169F7"} alignSelf={'flex-end'}>
          Clear All
        </Box>
        <Accordion allowMultiple mb={"28px"}>
          <SearchFilter />
          <CategoriesFilter />
          <BrandsFilter />
          <SizeFilter />
          <ColourFilter />
          <PriceFilter />
        </Accordion>
        <MainButton width='100%'>Apply changes</MainButton>
      </Flex>
    </ChakraProvider>
  );
};

export default Categories;
