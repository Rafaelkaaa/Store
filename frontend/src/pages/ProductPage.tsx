import { Box, Flex } from "@chakra-ui/react";
import Header from "../components/Header/Header.tsx";
import ProductVideo from "../components/ProductVideo/ProductVideo.tsx";
import CardList from "../components/CardList/CardList.tsx";
import { Provider } from "react-redux";
import store from "../features/store/store.ts";
import Footer from "../components/Footer/Footer.tsx";
import Breadcrumbs from "../components/Breadcrumbs/Breadcrumbs.tsx";
import Filters from "../components/Filters/Filters.tsx";
import Categories from "../components/Categories/Categories.tsx";
import SortProducts from "../components/SortProducts/SortProducts.tsx";
import Pagination from "../components/Pagination/Pagination.tsx";
import LoadMore from "../components/Pagination/LoadMore.tsx";

const ProductPage: React.FC = () => {
  return (
    <Box>
      <Header />
      <ProductVideo />
      <Flex w={"1400px"} flexDir={"column"} m={"0 auto 140px"} gap={"50px"}>
        <Breadcrumbs
          secondPage='Smart Home Security Solutions'
          thirdPage='Security Cameras'
        />
        <Categories />
        <Flex justifyContent={"space-between"}>
          <Provider store={store}>
            <Filters />
            <Flex flexDir={"column"} gap={"35px"}>
              <SortProducts />
              <CardList />
              <LoadMore />
              <Pagination />
            </Flex>
          </Provider>
        </Flex>
      </Flex>
      <Footer />
    </Box>
  );
};

export default ProductPage;
