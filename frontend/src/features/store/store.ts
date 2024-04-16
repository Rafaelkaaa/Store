import { configureStore } from '@reduxjs/toolkit';
import cardReducer from '../card/cardSlice'

const store = configureStore({
  reducer: {
    cards: cardReducer
  }
});

export type RootState = ReturnType<typeof store.getState>;
export default store;