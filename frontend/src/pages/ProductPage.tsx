import { Box, Flex } from "@chakra-ui/react";
import Header from "../components/Header/Header.tsx";
import CardList from "../components/CardList/CardList.tsx";
import { Provider } from "react-redux";
import store from "../features/store/store.ts";
import Categories from "../components/Categories/Categories.tsx";
import Footer from "../components/Footer/Footer.tsx";

const ProductPage: React.FC = () => {
  return (
    <Box>
      <Header />
      <Flex  gap={"45px"} justifyContent={'center'} m={'90px 0'}>
        <Provider store={store}>
          <Categories />
          <CardList />
        </Provider>
      </Flex>
        <Footer />
    </Box>
  );
};

export default ProductPage;
