import {Box} from "@chakra-ui/react";
import Header from "../components/Header.tsx";
import CardList from "../components/CardList/CardList.tsx";
import { Provider } from "react-redux";
import store from "../features/store/store.ts";

const ProductPage: React.FC = () => {
  return (
    <Box>
      <Header />
      <Box display='flex' flexDir='column' alignItems='center'>
        <Provider store={store}>
          <CardList />
        </Provider>
      </Box>
    </Box>
  )
}

export default ProductPage