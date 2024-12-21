# Base image
FROM node:22-alpine

# Setting working directory
WORKDIR /app

# Install dependencies
COPY package.json yarn.lock ./
RUN yarn install
COPY . .
# Genenerate build
RUN yarn build 

# Expose application port
EXPOSE 3000
CMD ["yarn", "start"]
